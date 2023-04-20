package com;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
// import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DemoApplication {
// implements CommandLineRunner {
	
	
	// @Autowired
	// private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
// 	@Override
// 	public void run(String... args) throws Exception{
// 		String sql = "INSERT INTO person (id, birth_date,location,name) VALUES ('3', sysdate(),'mumbai','leo')";
// 		int result = jdbcTemplate.update(sql, args);

// 		if (result>0){
// 			System.out.println("A new row has been added");
// 		}
		
		
// 	}

// }
