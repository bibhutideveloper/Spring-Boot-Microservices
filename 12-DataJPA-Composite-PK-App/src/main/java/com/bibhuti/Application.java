package com.bibhuti;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bibhuti.entity.Account;
import com.bibhuti.entity.AccountPK;
import com.bibhuti.repository.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
		AccountRepo repo = context.getBean(AccountRepo.class);
	
		/*
		
		// setting composite key
		AccountPK pk = new AccountPK();
		
		pk.setAccNumber(98724979247L);
		pk.setAccType("Savings");
		
		// setting entity data
		Account acc = new Account();
		acc.setHolderName("Bibhuti");
		acc.setBranch("Pune");
		acc.setAccountPk(pk); // setting pk object
		
		repo.save(acc);
		
		System.out.println("Account created...");
		
		*/
		
		AccountPK pk = new AccountPK();		
		pk.setAccNumber(98724979247L);
		pk.setAccType("Savings");
		
		Optional<Account> accData = repo.findById(pk);
		
		if(accData.isPresent()) {
			System.out.println("Account Data:: "+accData.get());
		}
		
		
	}

}
