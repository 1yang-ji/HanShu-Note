package demo;

/***
 * 
 * @author ����
 * demo:ǳ̸java�ص�����
 * Github:https://github.com/hanshuaikang
 *
 */

//����һ��ѧ����
public class Student {
    /***
     * 	����һ��ѧ������ҵ�ķ���
     * @param c ����һ��CallBack�ӿ�������Student�е�doHomeworK����������ɻص�
    */
	public void doHomeWork(CallBack c) {
		System.out.println("ѧ������ҵ������");
		System.out.println("---��ʼ�ص�֪ͨ��ʦ--- ");
		c.checkUpHomeWork();//�ص�����
	}
	
	

}
