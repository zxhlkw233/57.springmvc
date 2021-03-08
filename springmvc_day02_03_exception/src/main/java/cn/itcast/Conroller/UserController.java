package cn.itcast.Conroller;

import cn.itcast.exception.SysException;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/testException")
	public String testException() throws SysException {
		System.out.println("testException方法执行了");

		try {
			//模拟异常
			int a = 10/0;
		} catch (Exception e) {
			//打印异常信息
			e.printStackTrace();
			//抛出自定义异常信息
			throw new SysException("查询所有的用户出现了错误");
		}

		return "success";
	}
}
