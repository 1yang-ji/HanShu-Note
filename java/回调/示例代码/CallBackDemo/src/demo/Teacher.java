package demo;


/***
 * 
 * @author ����
 * demo:ǳ̸java�ص�����
 * Github:https://github.com/hanshuaikang
 *
 */


//����һ����ʦ�ಢ��ʵ��CallBack�ӿ�
public class Teacher implements CallBack {

	//�������д���һ��ѧ������
    public Teacher(Student s) {
		// TODO Auto-generated constructor stub
    	//�ѵ�ǰ�ഫ�ݸ�Student
    	s.doHomeWork(this);
	}

    

    //ʵ�ֽӿ��е�checkUpHomeWord����
	@Override
	public void checkUpHomeWork() {
		// TODO Auto-generated method stub
		System.out.println("��ʦ�����ҵ");
		
	}

}
