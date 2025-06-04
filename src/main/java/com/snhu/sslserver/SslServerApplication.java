package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}

//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";
@RestController
class ServerController {
	@RequestMapping("/hash")
	public String HashedVal() {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			String data = "Ryan Grunest";
			byte[] hash = digest.digest(data.getBytes());

			// convert to hex for display
			StringBuilder hexString = new StringBuilder();
			for (byte b : hash) {
				String hex = Integer.toHexString(0xff & b);
				if (hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}

			return "Data: " + data + ", Hash: " + hexString;

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return "Error: " + e.getMessage();
		}
	}
}