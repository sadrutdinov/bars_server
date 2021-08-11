package com.aydar.test.bars.repository;

import com.aydar.test.bars.entity.Contract;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;
import java.util.GregorianCalendar;


// fills the database with test data
@Configuration
class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(ContractRepository repository) {

        return args -> {
            repository.save(new Contract(1,
                    new GregorianCalendar(2020, Calendar.NOVEMBER, 1, 0,0,0),
                    new GregorianCalendar(2021, Calendar.JANUARY, 12,0,0,0)));

            repository.save(new Contract(230,
                    new GregorianCalendar(2014, Calendar.SEPTEMBER, 12,0,0,0),
                    new GregorianCalendar(2020, Calendar.FEBRUARY, 17, 0,0,0)));
            repository.save(new Contract(67,
                    new GregorianCalendar(2021, Calendar.JANUARY, 2,0,0,0),
                    new GregorianCalendar(2021, Calendar.JULY, 10, 0,0,0)));
            repository.save(new Contract(23,
                    new GregorianCalendar(2017, Calendar.APRIL, 28,0,0,0),
                    new GregorianCalendar(2021, Calendar.AUGUST, 8, 0,0,0)));
            repository.save(new Contract(117,
                    new GregorianCalendar(2018, Calendar.MARCH, 8,0,0,0),
                    new GregorianCalendar(2021, Calendar.JUNE, 14, 0,0,0)));
        };
    }
}