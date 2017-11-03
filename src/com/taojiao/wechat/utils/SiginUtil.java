package com.taojiao.wechat.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;


public class SiginUtil {
private static String token="taojiao";
public static boolean checkSignature(String signature,String timestamp,String nonce){
	String[] arr=new String[]{token,timestamp,nonce};
	//��arr�����ֵ�����
	Arrays.sort(arr);
	StringBuilder content=new StringBuilder();
	for (int i = 0; i < arr.length; i++) {
		content.append(arr[i]);
	}
	
	MessageDigest md=null;
	String tmpStr=null;
	try {
		md=MessageDigest.getInstance("SHA-1");
		//�������ַ���ƴ�ӳ�һ���ַ������м���
		byte[] digest = md.digest(content.toString().getBytes());
		tmpStr=byteToStr(digest);
	} catch (NoSuchAlgorithmException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	content=null;
	//��sha11���ܺ���ַ�����signature�Աȣ���ʾ��������Դ��΢��
	return tmpStr!=null?tmpStr.equals(signature.toUpperCase()):false;
	}
//���ֽ�ת�����ַ���
private static String byteToStr(byte[] digest) {
	// TODO Auto-generated method stub
	String strDigest="";
	for (int i = 0; i < digest.length; i++) {
		strDigest+=byteToHexStr(digest[i]);
	}
	return strDigest;
}

private static String byteToHexStr(byte b) {
	// TODO Auto-generated method stub
	char[] Digit={'0','1','2','3','4','5','6','7','8','9','A',
			'B','C','D','E','F'};
	char[] tmpArr=new char[2];
	tmpArr[0]=Digit[(b >>> 4)& 0X0F];
	tmpArr[1]=Digit[b & 0X0F];
	String s=new String(tmpArr);
	return s;
}
}
