package com.own;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * ����ҵ����
 * @author Administrator
 */
public class Operate {
	private List<Person> L;
	public Operate() {
		this.L=new ArrayList<Person>();
	}
	/**
	 * �û��������ҵ���߼�
	 */
	public void addLogic() {
		Menu m=new Menu();
		FieldValidate fv=new FieldValidate();
		while(true) {
			m.addMenu();
			int num=fv.menuNumVal(1, 3);
			switch(num) {
			case 1:this.addOperation();break;
			case 2:this.showAll();break;
			case 3:return;
			}
		}
	}
	/**
	 * �û����Ʋ�ѯҵ���߼�
	 */
	public void serchLogic() {
		Menu m=new Menu();
		FieldValidate fv=new FieldValidate();
		while(true) {
			m.serchMenu();;
			int num=fv.menuNumVal(1, 7);
			switch(num) {
			case 1:this.serchByName();break;
			case 2:this.serchByAge();break;
			case 3:this.serchBySex();break;
			case 4:this.serchByAddress();break;
			case 5:this.serchByTelNum();break;
			case 6:this.showAll();break;
			case 7:return;
			}
		}
	}
	/**
	 * �޸�ҵ���߼�
	 */
	public void modifyLogic() {
		Menu m=new Menu();
		FieldValidate fv=new FieldValidate();
		while(true) {
			m.modifyMenu();;
			int num=fv.menuNumVal(1, 3);
			switch(num) {
			case 1:this.modifyOperation();;break;
			case 2:this.showAll();break;
			case 3:return;
			}
		}
	}
	/**
	 * ����ҵ���߼�
	 */
	public void orderLogic() {
		Menu m=new Menu();
		FieldValidate fv=new FieldValidate();
		while(true) {
			m.orderMenu();
			int num=fv.menuNumVal(1, 5);
			switch(num) {
			case 1:this.orderByName();break;
			case 2:this.orderByAge();break;
			case 3:this.orderBySex();break;
			case 4:this.showAll();break;
			case 5:return;
			}
		}
	}
	/**
	 * ɾ��ҵ���߼�
	 */
	public void delLogic() {
		Menu m=new Menu();
		FieldValidate fv=new FieldValidate();
		while(true) {
			m.deleteMenu();;
			int num=fv.menuNumVal(1, 3);
			switch(num) {
			case 1:this.delOperation();break;
			case 2:this.delAllOperation();break;
			case 3:return;
			}
		}
	}
	/**
	 * ��Ӽ�¼
	 */
	public void addOperation() {
		FieldValidate fv=new FieldValidate();
		String name=fv.nameVal();
		String age=fv.ageVal();
		String sex=fv.sexVal();
		String telNum=fv.telNumVal();
		String address=fv.addVal();
		Person p=new Person(name,age,sex,telNum,address);
		this.L.add(p);
		p.setId(L.size());
	}
	/**
	 * ��ѯȫ��¼
	 */
	public void showAll() {
		if (this.L.size()==0) {
			System.out.println("û�м�¼");
			return;
		}
		for (Person p:this.L) {
			System.out.println(p);
			try { TimeUnit.SECONDS.sleep(5); ;
			} catch (InterruptedException ie){}
		}
	}
	/**
	 * ����ͬ��field��ѯ��¼
	 */
	public void serchByAge() {
		FieldValidate fv=new FieldValidate();
		String age=fv.ageVal();
		boolean flag=true;
		for (Person p:this.L) {
			if (p.getAge().equals(age)) {
				System.out.println(p);
				try { TimeUnit.SECONDS.sleep(5); ;
				} catch (InterruptedException ie){}
				flag=false;
			}
		}
		if (flag) {
			System.out.println("û���ҵ���¼");
		}
	}
	public void serchByName() {
		FieldValidate fv=new FieldValidate();
		String name=fv.nameVal();
		boolean flag=true;
		for (Person p:this.L) {
			if (p.getName().equals(name)) {
				System.out.println(p);
				try { TimeUnit.SECONDS.sleep(5); ;
				} catch (InterruptedException ie){}
				flag=false;
			}
		}
		if (flag) {
			System.out.println("û���ҵ���¼");
		}
	}
	public void serchBySex() {
		FieldValidate fv=new FieldValidate();
		String sex=fv.sexVal();
		boolean flag=true;
		for (Person p:this.L) {
			if (p.getSex().equals(sex)) {
				System.out.println(p);
				try { TimeUnit.SECONDS.sleep(5); ;
				} catch (InterruptedException ie){}
				flag=false;
			}
		}
		if (flag) {
			System.out.println("û���ҵ���¼");
		}
	}
	public void serchByTelNum() {
		FieldValidate fv=new FieldValidate();
		String telNum=fv.telNumVal();
		boolean flag=true;
		for (Person p:this.L) {
			if (p.getTelNum().equals(telNum)) {
				System.out.println(p);
				try { TimeUnit.SECONDS.sleep(5); ;
				} catch (InterruptedException ie){}
				flag=false;
			}
		}
		if (flag) {
			System.out.println("û���ҵ���¼");
		}
	}
	public void serchByAddress() {
		FieldValidate fv=new FieldValidate();
		String address=fv.addVal();
		boolean flag=true;
		for (Person p:this.L) {
			if (p.getAddress().equals(address)) {
				System.out.println(p);
				try { TimeUnit.SECONDS.sleep(5); ;
				} catch (InterruptedException ie){}
				flag=false;
			}
		}
		if (flag) {
			System.out.println("û���ҵ���¼");
		}
	}
	/**
	 * ɾ����¼
	 */
	public void delOperation() {
		FieldValidate fv=new FieldValidate();
		System.out.println("������Ҫɾ�������");
		int id=fv.menuNumVal(1, this.L.size());
		this.L.remove(id-1);
		//�����������
		for (int i=0;i<this.L.size();i++) {
			L.get(i).setId(i+1);
		}
		System.out.println("ɾ���ɹ�");
		try { TimeUnit.SECONDS.sleep(2); 
		} catch (InterruptedException ie){}
		
	}
	/**
	 * ɾ��ȫ����¼
	 */
	public void delAllOperation() {
		this.L.clear();
		System.out.println("�绰����¼���");
		try { TimeUnit.SECONDS.sleep(2); 
		} catch (InterruptedException ie){}
	}
	/**
	 * �޸ļ�¼
	 */
	public void modifyOperation() {
		Menu m=new Menu();
		FieldValidate fv=new FieldValidate();
		m.subModifyMenu();
		int orderNum=fv.menuNumVal(1, 6);
		System.out.println("������Ҫ�޸ĵ����");
		int num=fv.menuNumVal(1, this.L.size());
		switch(orderNum) {
		case 1:String name=fv.nameVal();
			this.L.get(num-1).setName(name);break;
		case 2:String age=fv.ageVal();
		this.L.get(num-1).setAge(age);break;
		case 3:String sex=fv.sexVal();
		this.L.get(num-1).setSex(sex);break;
		case 4:String address=fv.addVal();
		this.L.get(num-1).setAddress(address);break;
		case 5:String telNum=fv.telNumVal();
		this.L.get(num-1).setTelNum(telNum);break;
		case 6:return;
		}
	}
	/**
	 * ����ͬ��field����
	 */
	public void orderByName() {
		//����Collections�������sort������List����������Ҫ����ö����Լ��Ƚ�������
		Collections.sort(this.L,new orderName());
		//�����������
		for(int i=0;i<L.size();i++) {
			L.get(i).setId(i+1);
		}
	}
	public void orderByAge() {
		//����Collections�������sort������List����������Ҫ����ö����Լ��Ƚ�������
		Collections.sort(this.L,new orderAge());
		//�����������
		for(int i=0;i<L.size();i++) {
			L.get(i).setId(i+1);
		}
	}
	public void orderBySex() {
		//����Collections�������sort������List����������Ҫ����ö����Լ��Ƚ�������
		Collections.sort(this.L,new orderSex());
		//�����������
		for(int i=0;i<L.size();i++) {
			L.get(i).setId(i+1);
		}	
	}
	/**
	 * Ϊ�˽�������ʵ��3���Ƚ���
	 * ����ΪOperate���ڲ���
	 */
	class orderName implements Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			//String���µ�compareTo����������ĸ����Ƚ������ַ��������ݽ��������������
			return o1.getName().compareTo(o2.getName());
		}
		
	}
	class orderAge implements Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.getAge().compareTo(o2.getAge());
		}	
	}
	class orderSex implements Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.getSex().compareTo(o2.getSex());
		}
	}
}
