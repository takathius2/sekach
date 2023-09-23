package bean;

import java.io.Serializable;

public class RegisterBean implements Serializable {
	//メンバ変数名
	private String name;
	private String age;
	private String[] langs;
	
	public RegisterBean() {
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public void setLangs(String[] langs) {
		this.langs = langs;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String[] getLangs() {
		return langs;
	}
	
	
	//独自のメソッド1
	public String getJpnAge() {
		String jpnAge;
		if(age.equals("child")) {
			jpnAge = "18歳未満";
		} else {
			jpnAge = "18歳以上";
		}
		return jpnAge;
	}
	
	//独自メソッド2
	public String getStrLangs() {
		String strLangs = "";
		for(int i = 0; i < langs.length; i++) {
			strLangs = strLangs + langs[i] + "";
		}
		return strLangs;
	}
	
	
}