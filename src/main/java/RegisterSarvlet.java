


/**
 *import java.io.IOException; //PrintWriterを機能させるパッケージ
 *import javax.servlet.annotation.WebServlet;
 *import javax.servlet.http.HttpServlet; //Http Servletクラスを機能させるパッケージ
 *import javax.servlet.http.HttpServletRequest;
 *import javax.servlet.http.HttpServletResponse;
 * import javax.servlet.ServletException;
 */

//PrintWriterを機能させるパッケージ
import java.io.IOException;

import javax.servlet.RequestDispatcher;
//Http　ServretクラスはこのGenericServletを継承しているため機能させるのに必要なパッケージ
import javax.servlet.ServletException;
//アノテーションを機能させるパッケージ
import javax.servlet.annotation.WebServlet;
//Http Servletクラスを機能させるパッケージ
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.RegisterBean;
/**
 * @(アノテーション＝注釈)でサーブレットを呼び出すURLを指定
 */

@WebServlet("/register")
/**
 * HttpServletクラスを継承することでサーブレットとして機能すると
 * RegisterSarvletクラスでWEBブラウザからリクエストを受け取れる
 */
public class RegisterSarvlet extends HttpServlet {
	//doPostメソッドを呼び出す
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
		//リクエストの文字コード指定
		req.setCharacterEncoding("utf-8");
		
		//入力情報の取得
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String[] langs = req.getParameterValues("lang");
		res.setContentType("text/html;charaset=utf-8");
		
		//Beanの作成
		RegisterBean rb = new RegisterBean();
		rb.setName(name);
		rb.setAge(age);
		rb.setLangs(langs);
		
		//Beanをリクエストに格納
		req.setAttribute("rb", rb);
		
		//register.jspへフォワード
		RequestDispatcher rd = req.getRequestDispatcher("/regist.jsp");
		rd.forward(req, res);
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOExeception, ServletException {
		doPost(req, res);
	}
}
