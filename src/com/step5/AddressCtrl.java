package com.step5;
class AddressVO{
	//INSERT|UPDATE|DELETE|SELECT
	private String command = null;
	private int result = 0;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}
}
public class AddressCtrl {
	public final String _SEL = "select";
	public final String _UPD = "update";
	public final String _DEL = "delete";
	public final String _INS = "insert";
	public AddressVO send(AddressVO paVO) {
		AddressVO raVO = new AddressVO();
		String command = paVO.getCommand();//INSERT|UPDATE|DELETE|SELECT
		//너 입력을 원해?
		if("insert".equals(command)) {
			AddressInsert ai = new AddressInsert();
			int result = ai.addressAdd();
			raVO.setResult(result);
		}
		else if("update".equals(command)) {
			AddressUpdate ai = new AddressUpdate();
			int result = ai.addressUpdate();
			raVO.setResult(result);
		}
		return raVO;
	}
}
