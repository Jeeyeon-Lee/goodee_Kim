package project.star;

import java.util.HashMap;
import java.util.Map;

class UserInfo {
	private String M_id;
	private String M_pw;
	private String M_name;

	Map<String, Object> members = new HashMap<>();

	public UserInfo(String m_id, String m_pw, String m_name) {
		setM_id(m_id);
		setM_pw(m_pw);
		setM_name(m_name);

	}

	public UserInfo(String m_id) {
		setM_id(m_id);
	}

	public String getM_id() {
		return M_id;
	}

	public void setM_id(String m_id) {
		M_id = m_id;
		members.get(m_id);
	}

	public String getM_pw() {
		return M_pw;
	}

	public void setM_pw(String m_pw) {
		M_pw = m_pw;
		members.get(m_pw);
	}

	public String getM_name() {
		return M_name;
	}

	public void setM_name(String m_name) {
		M_name = m_name;
		members.get(M_name);
	}

}
