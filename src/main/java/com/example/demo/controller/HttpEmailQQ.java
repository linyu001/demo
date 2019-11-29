package com.example.demo.controller;


import org.apache.commons.mail.HtmlEmail;

public class HttpEmailQQ {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			sendEmail("");
		}
		System.out.println("全部发送完毕");
	}
	
	public static  void sendEmail(String time) {
		  try {
	            //邮箱服务器地址如：smtp.qq.com
	            String hostName ="smtp.qq.com";
	            // 帐号与密码
	            String userName ="1923477173";//测试账号 
	            String password = "nxayfosbbayabehh";
	            // 发件人
	            String fromAddress ="1923477173@qq.com";//测试邮箱
	            // 发件人姓名
	            String fromName = "帅哥";
	            HtmlEmail email=new HtmlEmail();
	            email.setHostName(hostName);// 设置smtp服务器
	            email.setAuthentication(userName, password);// 设置授权信息
	            email.setCharset("utf-8");
	            email.setFrom(fromAddress, fromName, "utf-8");// 设置发件人信息
	            email.setSubject("蜀道难");// 设置主题
			  email.setHtmlMsg("北京时间现在是："+time+"<br>蜀道难<br>李白<br>噫吁嚱，危乎高哉！蜀道之难，难于上青天！蚕丛及鱼凫，开国何茫然！尔来四万八千岁，不与秦塞通人烟。西当太白有鸟道，可以横绝峨眉巅。地崩山摧壮士死，然后天梯石栈相钩连。上有六龙回日之高标，下有冲波逆折之回川。黄鹤之飞尚不得过，猿猱欲度愁攀援。青泥何盘盘，百步九折萦岩峦。扪参历井仰胁息，以手抚膺坐长叹。<br>问君西游何时还？畏途巉岩不可攀。但见悲鸟号古木，雄飞雌从绕林间。又闻子规啼夜月，愁空山。蜀道之难，难于上青天，使人听此凋朱颜！连峰去天不盈尺，枯松倒挂倚绝壁。飞湍瀑流争喧豗，砯崖转石万壑雷。其险也如此，嗟尔远道之人胡为乎来哉！<br>剑阁峥嵘而崔嵬，一夫当关，万夫莫开。所守或匪亲，化为狼与豺。朝避猛虎，夕避长蛇；磨牙吮血，杀人如麻。锦城虽云乐，不如早还家。蜀道之难，难于上青天，侧身西望长咨嗟！");// 设置邮件内容
			//  email.addTo("1923477173@qq.com","utf-8");
	           // email.addTo("1923477173@qq.com","utf-8");
	           // email.addTo("2443551226@qq.com","utf-8");//测试邮箱 张
	           email.addTo("1520509547@qq.com","utf-8");//测试邮箱 王
	           // email.addTo("2602723161@qq.com","utf-8");//测试邮箱 聪
	            System.out.println(email.getHostName());
	            System.out.println(email.getSmtpPort());
	            email.send();// 发送邮件
	            System.out.println("成功");
	        } catch (Exception e) {
	            System.err.println("邮件发送失败");
	            e.printStackTrace();
	        }
	}

}
