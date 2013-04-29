package com.samples.oroshisoba.cipher;

/**
 * Execute Encryption with AES
 * 
 */
public class App {
	public static void main(String[] args) throws Exception {
		String foo = "1234567890123456";
		
		System.out.println("base: " + foo);
		
		AesCipher aesCipher = new AesCipher();
		byte[] result1 = aesCipher.encrypto(foo);

		System.out.println("Encrypted: " + new String(result1));
	}
}
