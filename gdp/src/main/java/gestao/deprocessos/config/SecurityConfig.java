package gestao.deprocessos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Desabilita a proteção CSRF para facilitar testes
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/tarefas/**").permitAll() // Permite acesso público ao endpoint /tarefas
                .anyRequest().authenticated()) // Requer autenticação para outros endpoints
            .httpBasic(); // Usa autenticação HTTP básica (se necessário)

        return http.build();
    }
}
