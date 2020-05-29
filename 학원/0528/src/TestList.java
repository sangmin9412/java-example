import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("이승무");
		list.add("이순신");
		list.add("유관순");
		list.add("솔데스크");

		for (String string : list) { 
			System.out.println(string);
		}
		
		System.out.println("-------------------------------");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------------------------");
		
		Object o1 = 10;
		Object o2 = 10.0;
		Object o3 = 'a';
		Object o4 = "String";
		
		int j = (int) o1;
		
		System.out.println("o1 > j = " + j);
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		System.out.println(o4);
		
		System.out.println("-------------------------------");
		
		List list2 = new ArrayList();
		list2.add(10);
		list2.add(10.0);
		list2.add('a');
		list2.add("이승무");
		
//		list2.remove((Integer)10); // 정수 값을 찾아 삭제때는 앞에 Integer 캐스팅을 붙여야 한다.
//		list2.remove(10.0);
		
		for (Object obj : list2) {
			System.out.println(obj); // 실제로 사용할 때 형변환을 해야 하기 때문에 여러 종류의 데이터 타입을 담는 것은 지양한다.
		}
		
		System.out.println("-------------------------------");
		
		System.out.println(list2.contains(10));
		System.out.println(list2.size());
		
		
		
	}

}
