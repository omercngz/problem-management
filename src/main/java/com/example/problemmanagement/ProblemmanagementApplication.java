package com.example.problemmanagement;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProblemmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProblemmanagementApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
// Tüm classlarda güvenli kullanmak için Construction Enjection yapıldı.
		/*///************** onemli*****************///
/** modelle mapper ile birlikte sevice katmanından önceki yani bizim iç yapımız ile (DB) ile IssueDB.. ile
 * konuşulacak
 * Db'den sonra ise Dto  katmanı yardımı ile konuşulacak yani burada db'den dto'ya içten haberleşme
 * Dto'dan db'ye dışdan haberleşme olacak.
 */
	}
}



