package akt.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.engine.transaction.jta.platform.internal.JOnASJtaPlatform;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity//bu bir veritabani tablosuna karsilik geldigini tanimliyor
@Table(name = "job_positions")
@AllArgsConstructor
@NoArgsConstructor

public class JobPosition {

	@Id// veritabaninda id oldugunu belirtiyoruz
	@Column(name = "id")//kolon ismini veriyoruz
	@GeneratedValue(strategy = GenerationType.IDENTITY)//veritabaninda bir bir artacagini belirtiyoruz
	private int id;
	
	@Column(name = "position")
	private String position;
	

}