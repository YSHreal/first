package com.own;
//程序入口类

public class App {
	/**
	 * 创建程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app=new App();
		app.start();
	}
	/**
	 * 调用菜单
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
