
	package com.own;

	import java.util.Scanner;

	/**
	 * 对输入的各个属性进行校验
	 * @author Administrator
	 *
	 */
	public  class FieldValidate {
		//对输入的选择菜单项数字进行验证
		public int menuNumVal(int min,int max) {
			String regex="[0-9]{1}";
			Scanner scanner=new Scanner(System.in);
			while(true) {
				System.out.println("请输入数字，最小为"+min+"最大为"+max);
				String s=scanner.nextLine();
				if (s.matches(regex)) {
					int i=Integer.parseInt(s);
					if((i>=min)&&(i<=max)) {
						return i;
					}else {
						System.out.println("数字不在范围内");
					}
				}else {
					System.out.println("输入不符合格式规范");
				}
			}
		}
		public String nameVal() {
			//匹配汉字
			String regex="\\W{2,5}";
			Scanner scanner=new Scanner(System.in);
			while(true) {
				System.out.println("请输入姓名，要求为2到5个汉字");
				String s=scanner.nextLine();
				if (s.matches(regex)) {
					return s;
				}else {
					System.out.println("输入不符合格式规范");
				}
			}
		}
		public String ageVal() {
			String regex="[0-9]{1,3}";
			Scanner scanner=new Scanner(System.in);
			while(true) {
				System.out.println("请输入年龄（1到150的数字）");
				String s=scanner.nextLine();
				if (s.matches(regex)) {
					int i=Integer.parseInt(s);
					if ((i>0)&&(i<=150)) {
						return s;
					}else {
						System.out.println("年龄不在范围内");
					}
				}else {
					System.out.println("输入不符合格式规范");
				}
			}
		}
		/**
		 * 可以有座机号也可以有手机号
		 * @return
		 */
		public String telNumVal() {
			String regex="(\\d{3,4}-\\d{7,8})|([1]{1}\\d{10})";
			Scanner scanner=new Scanner(System.in);
			while(true) {
				System.out.println("请输入电话号码（符合座机或电话号码规范）");
				String s=scanner.nextLine();
				if (s.matches(regex)) {
					return s;
				}else {
					System.out.println("输入不符合格式规范");
				}
			}
		}
		public String addVal() {
			String regex="\\W{5,20}";
			Scanner scanner=new Scanner(System.in);
			while(true) {
				System.out.println("请输入5到20位的汉语地址");
				String s=scanner.nextLine();
				if (s.matches(regex)) {
					return s;
				}else {
					System.out.println("输入不符合格式规范");
				}
			}
		}
		public String sexVal() {
			String regex="(M{1})|(W{1})";
			Scanner scanner=new Scanner(System.in);
			while(true) {
				System.out.println("请输入性别，M代表男，W代表女");
				String s=scanner.nextLine();
				if (s.matches(regex)) {
					return s;
				}else {
					System.out.println("输入不符合格式规范");
				}
			}
		}
	}

