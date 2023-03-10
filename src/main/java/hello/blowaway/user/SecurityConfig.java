//package hello.blowaway.user;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//        /**
//         * inMemory
//         */
//        auth.inMemoryAuthentication()
//                .withUser("away")
//                .password(passwordEncoder().encode("away")).roles("USER")
//                .and()
//                .withUser("superuser")
//                .password(passwordEncoder().encode("superuser"))
//                .roles("USER").roles("ADMIN");
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/blowAway/create", "/blowAway/update/*").hasRole("USER")
//                .antMatchers("/admin").hasRole("ADMIN")
//                .antMatchers("/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//            .loginPage("/blowAway/login")       // Spring Boot 기본 제공 : /login.html
//                .loginProcessingUrl("/loginProcess")
//                .defaultSuccessUrl("/blowAway", true)
//                .and()
//                .logout()
//                .and()
//                .exceptionHandling().accessDeniedPage("/403");
//    }
//}
