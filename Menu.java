package com.own;
/**
 * 打印出各个菜单
 * @author Administrator
 *
 */
public class Menu {
	public void mainMenu() {
		System.out.println("*************");
		System.out.println("*  1,添加记录  *");
		System.out.println("*  2,查找记录  *");
		System.out.println("*  3,删除记录  *");
		System.out.println("*  4,修改记录  *");
		System.out.println("*  5,排序记录  *");
		System.out.println("*  6,退出系统  *");
		System.out.println("*************");
	}
	public void orderMenu() {
		System.out.println("***************");
		System.out.println("*  1,按姓名排序  *");
		System.out.println("*  2,按年龄排序  *");
		System.out.println("*  3,按性别排序  *");
		System.out.println("*  4,查看全记录  *");
		System.out.println("*  5,退出菜单    *");
		System.out.println("***************");	
	}
	public void addMenu() {
		System.out.println("***************");
		System.out.println("*  1,添加新记录  *");
		System.out.println("*  2,查看全记录  *");
		System.out.println("*  3,退出菜单    *");
		System.out.println("***************");	
	}
	public void serchMenu() {
		System.out.println("***************");
		System.out.println("*  1,按姓名查找  *");
		System.out.println("*  2,按年龄查找  *");
		System.out.println("*  3,按性别查找  *");
		System.out.println("*  4,按地址查找  *");
		System.out.println("*  5,按号码查找  *");
		System.out.println("*  6,查看全记录  *");
		System.out.println("*  7,退出菜单    *");
		System.out.println("***************");
	}
	public void modifyMenu() {
		System.out.println("****************");
		System.out.println("*  1,修改指定记录  *");
		System.out.println("*  2,查找全记录    *");
		System.out.println("*  3,退出菜单     *");
		System.out.println("****************");	
	}
	public void subModifyMenu() {
		System.out.println("*************");
		System.out.println("*  1,修改姓名  *");
		System.out.println("*  2,修改年龄  *");
		System.out.println("*  3,修改性别  *");
		System.out.println("*  4,修改地址  *");
		System.out.println("*  5,修改号码  *");
		System.out.println("*  6,退出菜单  *");
		System.out.println("*************");
	}
	public void deleteMenu() {
		System.out.println("****************");
		System.out.println("*  1,删除指定记录  *");
		System.out.println("*  2,删除全部记录  *");
		System.out.println("*  3,退出菜单     *");
		System.out.println("****************");
	}
}
