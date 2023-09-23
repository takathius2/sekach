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
	    if ("child".equals(age)) {
	        return "18歳未満";
	    } else {
	        return "18歳以上";
	    }
	}
	
	//独自メソッド2
	public String getStrLangs() {
	    if (langs == null) {
	        return "";
	    }
	    
	    StringBuilder strLangs = new StringBuilder();
	    for (String lang : langs) {
	        strLangs.append(lang);
	    }
	    return strLangs.toString();
	}
	
}