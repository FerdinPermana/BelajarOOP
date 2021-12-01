package com.juaracoding.main;

public class Balok extends Kotak implements Ruang3D{

	@Override
	public float volume() {
		// TODO Auto-generated method stub
		return getNilaiSisi() * getNilaiSisi() *getNilaiSisi() ;
	}

}
