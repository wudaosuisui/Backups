package com.fairyonline.xiaoye.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="vertex")
public class Vertex {
	
	private int id;
	private int sign;//���   �Խڵ���з���
	private String name;//����ַ���   �����ɶ�����ƺϲ�
//	private String detail;//����
//	private String correlation;//�������
//	private int hot;//�ȶ�
	public Vertex() {}
	public Vertex(int sign,String name) {
		this.sign = sign;
		this.name = name;
		System.out.println("println Vertex : "+getSign()+" "+getName());
	}
	/*public Vertex(int id ,int sign,String name) {
		this.id =id;
		this.sign = sign;
		this.name = name;
		System.out.println("println Vertex : "+getSign()+" "+getName());
	}*/
	@Id
	@GeneratedValue(generator="my_gen")
    @GenericGenerator(name="my_gen", strategy="increment")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSign() {
		return sign;
	}

	public void setSign(int sign) {
		this.sign = sign;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public String getDetail() {
//		return detail;
//	}
//
//	public void setDetail(String detail) {
//		this.detail = detail;
//	}
//
//	public String getCorrelation() {
//		return correlation;
//	}
//
//	public void setCorrelation(String correlation) {
//		this.correlation = correlation;
//	}
	
	
}
