package com.own;
//���������

public class App {
	/**
	 * �����������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app=new App();
		app.start();
	}
	/**
	 * ���ò˵�
	 */
	public void start() {
		Menu M=new Menu();
		Operate operate=new Operate();
		FieldValidate fv=new FieldValidate();
		while(true) {
			M.mainMenu();
			int num=fv.menuNumVal(1, 6);
			switch (num){
			case 1:operate.addLogic();break;
			case 2:operate.serchLogic();break;
			case 3:operate.delLogic();break;
			case 4:operate.modifyLogic();break;
			case 5:operate.orderLogic();break;
			case 6:System.exit(0);
			}
		}
	}

}
