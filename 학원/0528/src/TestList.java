import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("�̽¹�");
		list.add("�̼���");
		list.add("������");
		list.add("�ֵ���ũ");

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
		list2.add("�̽¹�");
		
//		list2.remove((Integer)10); // ���� ���� ã�� �������� �տ� Integer ĳ������ �ٿ��� �Ѵ�.
//		list2.remove(10.0);
		
		for (Object obj : list2) {
			System.out.println(obj); // ������ ����� �� ����ȯ�� �ؾ� �ϱ� ������ ���� ������ ������ Ÿ���� ��� ���� �����Ѵ�.
		}
		
		System.out.println("-------------------------------");
		
		System.out.println(list2.contains(10));
		System.out.println(list2.size());
		
		
		
	}

}
