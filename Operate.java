package com.own;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 核心业务类
 * @author Administrator
 */
public class Operate {
	private List<Person> L;
	public Operate() {
		this.L=new ArrayList<Person>();
	}
	/**
	 * 用户控制添加业务逻辑
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
	 * 用户控制查询业务逻辑
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
	 * 修改业务逻辑
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
	 * 排序业务逻辑
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
	 * 删除业务逻辑
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
	 * 添加记录
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
	 * 查询全记录
	 */
	public void showAll() {
		if (this.L.size()==0) {
			System.out.println("没有记录");
			return;
		}
		for (Person p:this.L) {
			System.out.println(p);
			try { TimeUnit.SECONDS.sleep(5); ;
			} catch (InterruptedException ie){}
		}
	}
	/**
	 * 按不同的field查询记录
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
			System.out.println("没有找到记录");
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
			System.out.println("没有找到记录");
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
			System.out.println("没有找到记录");
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
			System.out.println("没有找到记录");
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
			System.out.println("没有找到记录");
		}
	}
	/**
	 * 删除记录
	 */
	public void delOperation() {
		FieldValidate fv=new FieldValidate();
		System.out.println("请输入要删除的序号");
		int id=fv.menuNumVal(1, this.L.size());
		this.L.remove(id-1);
		//重新设置序号
		for (int i=0;i<this.L.size();i++) {
			L.get(i).setId(i+1);
		}
		System.out.println("删除成功");
		try { TimeUnit.SECONDS.sleep(2); 
		} catch (InterruptedException ie){}
		
	}
	/**
	 * 删除全部记录
	 */
	public void delAllOperation() {
		this.L.clear();
		System.out.println("电话本记录清空");
		try { TimeUnit.SECONDS.sleep(2); 
		} catch (InterruptedException ie){}
	}
	/**
	 * 修改记录
	 */
	public void modifyOperation() {
		Menu m=new Menu();
		FieldValidate fv=new FieldValidate();
		m.subModifyMenu();
		int orderNum=fv.menuNumVal(1, 6);
		System.out.println("请输入要修改的序号");
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
	 * 按不同的field排序
	 */
	public void orderByName() {
		//利用Collections工具类的sort方法对List对象排序，需要传入该对象以及比较器对象
		Collections.sort(this.L,new orderName());
		//重新生成序号
		for(int i=0;i<L.size();i++) {
			L.get(i).setId(i+1);
		}
	}
	public void orderByAge() {
		//利用Collections工具类的sort方法对List对象排序，需要传入该对象以及比较器对象
		Collections.sort(this.L,new orderAge());
		//重新生成序号
		for(int i=0;i<L.size();i++) {
			L.get(i).setId(i+1);
		}
	}
	public void orderBySex() {
		//利用Collections工具类的sort方法对List对象排序，需要传入该对象以及比较器对象
		Collections.sort(this.L,new orderSex());
		//重新生成序号
		for(int i=0;i<L.size();i++) {
			L.get(i).setId(i+1);
		}	
	}
	/**
	 * 为了进行排序实现3个比较器
	 * 定义为Operate的内部类
	 */
	class orderName implements Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			//String类下的compareTo方法根据字母排序比较两个字符串，根据结果返回正数或负数
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
