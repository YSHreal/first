
	package com.own;

	import java.util.Scanner;

	/**
	 * ������ĸ������Խ���У��
	 * @author Administrator
	 *
	 */
	public  class FieldValidate {
		//�������ѡ��˵������ֽ�����֤
		public int menuNumVal(int min,int max) {
			String regex="[0-9]{1}";
			Scanner scanner=new Scanner(System.in);
			while(true) {
				System.out.println("���������֣���СΪ"+min+"���Ϊ"+max);
				String s=scanner.nextLine();
				if (s.matches(regex)) {
					int i=Integer.parseInt(s);
					if((i>=min)&&(i<=max)) {
						return i;
					}else {
						System.out.println("���ֲ��ڷ�Χ��");
					}
				}else {
					System.out.println("���벻���ϸ�ʽ�淶");
				}
			}
		}
		public String nameVal() {
			//ƥ�人��
			String regex="\\W{2,5}";
			Scanner scanner=new Scanner(System.in);
			while(true) {
				System.out.println("������������Ҫ��Ϊ2��5������");
				String s=scanner.nextLine();
				if (s.matches(regex)) {
					return s;
				}else {
					System.out.println("���벻���ϸ�ʽ�淶");
				}
			}
		}
		public String ageVal() {
			String regex="[0-9]{1,3}";
			Scanner scanner=new Scanner(System.in);
			while(true) {
				System.out.println("���������䣨1��150�����֣�");
				String s=scanner.nextLine();
				if (s.matches(regex)) {
					int i=Integer.parseInt(s);
					if ((i>0)&&(i<=150)) {
						return s;
					}else {
						System.out.println("���䲻�ڷ�Χ��");
					}
				}else {
					System.out.println("���벻���ϸ�ʽ�淶");
				}
			}
		}
		/**
		 * ������������Ҳ�������ֻ���
		 * @return
		 */
		public String telNumVal() {
			String regex="(\\d{3,4}-\\d{7,8})|([1]{1}\\d{10})";
			Scanner scanner=new Scanner(System.in);
			while(true) {
				System.out.println("������绰���루����������绰����淶��");
				String s=scanner.nextLine();
				if (s.matches(regex)) {
					return s;
				}else {
					System.out.println("���벻���ϸ�ʽ�淶");
				}
			}
		}
		public String addVal() {
			String regex="\\W{5,20}";
			Scanner scanner=new Scanner(System.in);
			while(true) {
				System.out.println("������5��20λ�ĺ����ַ");
				String s=scanner.nextLine();
				if (s.matches(regex)) {
					return s;
				}else {
					System.out.println("���벻���ϸ�ʽ�淶");
				}
			}
		}
		public String sexVal() {
			String regex="(M{1})|(W{1})";
			Scanner scanner=new Scanner(System.in);
			while(true) {
				System.out.println("�������Ա�M�����У�W����Ů");
				String s=scanner.nextLine();
				if (s.matches(regex)) {
					return s;
				}else {
					System.out.println("���벻���ϸ�ʽ�淶");
				}
			}
		}
	}

