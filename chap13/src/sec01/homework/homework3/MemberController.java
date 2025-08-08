package sec01.homework.homework3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MemberController {
	// HashMap 객체 생성
	Map<String, Member> map = new HashMap<>();
	
		public boolean joinMember(String id, Member m) {
			// 1. 전달 받은 id가 없다면 id와 m을 map에 추가후 true 반환
			// -> containsKey로 판단
			// 2. 이미 있다면 false 값 반환
			if (!map.containsKey(id)) {
				map.put(id, m);
				return true;
			} else {
				return false;
			}
		}
		
		public String logIn(String id, String password) {
			// 1. 전달 받은 id가 존재하는지 확인
			// -> containsKey로 판단
			if (map.containsKey(id)) {
				// 2. 존재하면 Member에 저장된 비밀번호와 사용자가 입력한 비밀번호 비교
				Member m = map.get(id);
				String pw = m.getPassword();
				if (password.equals(pw)) {
					// 3. 같다면 저장된 Member의 이름 반환
					return m.getName();
				}
			}else {
				// 4. 그 외의 모든 상황에서는 null 반환
				return null;
			}
			return null;
		}
		
		public boolean changePassword(String id, String oldPw, String newPw) {
			// 1. 아이디가 존재하면서 
			// + 저장된 비밀번호와 사용자가 입력한 비밀번호가 같을 때
			Member m = map.get(id);
			if(map.containsKey(id) && (oldPw.equals(m.getPassword()))) {
				// 2. 새로운 비밀번호로 바꾸고 true 반환
				// 3. 그 외의 모든 상황에서는 false 반환
				m.setPassword(newPw);
				return true;
			} else{
				return false;
			}
		}
		
		public void changeName(String id, String newName) {
			Member m = map.get(id);
			// 1. 전달 받은 id를 통해 Member의 이름을 새로 입력한 이름으로 변경
			m.setName(newName);
		}
		
		public TreeMap<String,String> sameName(String name) {
			Set<String> keyset = map.keySet();
			Set<Map.Entry<String, Member>> entry = map.entrySet();
			
			Iterator<String> keyIterator = keyset.iterator();
			while(keyIterator.hasNext()) {
				String key = keyIterator.next();
				Member m = map.get(key);
				String entryName = m.getName();
				String entryPw = m.getPassword();
				// 1. 전달받은 name이 저장된 데이터의 이름과 같은지 확인
				if (entryName.equals(name)) {
					// 2. 전달받은 name과 저장된 데이터의 name이 같다면
					TreeMap<String, Member> sameName = new TreeMap<String, Member>();
					sameName.put(key, m);
				}
				
			}
			// -> key를 기준으로 오름차순 해주는 TreeMap 객체에 id와 이름 저장 후 객체 반환
			// -> 엘리먼트를 하나씩 뽑아낼때 keySet()을 쓸 것
			return sameName;
		}
}
