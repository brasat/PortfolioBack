    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package com.example.Springboott.Controller;


    import com.example.Springboott.jwt.JwtAuthResponseDTO;
    import com.example.Springboott.jwt.JwtTokerProvider;
    import com.example.Springboott.jwt.LoginDTO;
import com.example.Springboott.jwt.RegistRequest;
    import com.example.Springboott.jwt.RegistroDTO;
import com.example.Springboott.model.Persona;
import com.example.Springboott.repository.PersonaRepository;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.security.authentication.AuthenticationManager;
    import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
    import org.springframework.security.core.Authentication;
    import org.springframework.security.core.context.SecurityContextHolder;
    import org.springframework.security.crypto.password.PasswordEncoder;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RestController;

    /**
     *
     * @author Bruno
     */

    @RestController
     @RequestMapping("/")
    public class AuthController {

            @Autowired
            private AuthenticationManager authenticationManager;

            @Autowired
            private PersonaRepository usuarioRepositorio;


            @Autowired
            private PasswordEncoder passwordEncoder;

            @Autowired
            private JwtTokerProvider jwtTokenProvider;
	
   
	@PostMapping("/iniciar-sesion")
	public ResponseEntity<JwtAuthResponseDTO> authenticateUser(@RequestBody LoginDTO loginDTO){
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDTO.getUsernameOrEmail(), loginDTO.getPassword()));
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		//obtenemos el token del jwtTokenProvider
		String token = jwtTokenProvider.generarToken(authentication);
		return ResponseEntity.ok(new JwtAuthResponseDTO(token));
	}
	
        
       
	@PostMapping("/registrar")
	public ResponseEntity<?> registrarUsuario(@RequestBody RegistroDTO registroDTO){
		if(usuarioRepositorio.existsByUsername(registroDTO.getUsername())) {
			return new ResponseEntity<>("Ese nombre de usuario ya existe",HttpStatus.BAD_REQUEST);
		}
		
		if(usuarioRepositorio.existsByEmail(registroDTO.getEmail())) {
			return new ResponseEntity<>("Ese email de usuario ya existe",HttpStatus.BAD_REQUEST);
		}
		
		Persona usuario = new Persona();
		usuario.setNombre(registroDTO.getNombre());
                usuario.setApellido(registroDTO.getApellido());
		usuario.setUsername(registroDTO.getUsername());
		usuario.setEmail(registroDTO.getEmail());
		usuario.setPassword(passwordEncoder.encode(registroDTO.getPassword()));
		
		
		usuarioRepositorio.save(usuario);
                
                RegistRequest user = new RegistRequest(usuario.getCorreo(),"Usuario Registrado correctamente");
		return  ResponseEntity.ok(user);
	}
}
