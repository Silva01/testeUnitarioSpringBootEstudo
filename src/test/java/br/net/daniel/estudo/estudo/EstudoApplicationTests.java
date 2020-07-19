package br.net.daniel.estudo.estudo;

import br.net.daniel.estudo.estudo.controller.HelloWordController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(controllers = HelloWordController.class)
class EstudoApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testandoUlrHelloWord() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello Word"));
    }

}
