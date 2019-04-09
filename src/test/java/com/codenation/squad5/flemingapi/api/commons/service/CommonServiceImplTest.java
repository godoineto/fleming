package com.codenation.squad5.flemingapi.api.commons.service;

import com.codenation.squad5.flemingapi.api.common.dto.EnderecoDTO;
import com.codenation.squad5.flemingapi.api.common.model.Endereco;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonServiceImplTest {
    private Endereco endereco = new Endereco();
    /*private EnderecoDTO enderecoDTO;
    private ModelMapper modelMapper = new ModelMapper();*/

    @Before
    public void setUp(){
        endereco.setBairro("Centro");
        endereco.setCep("35.960-000");
        endereco.setCidade("Santa Barbara");
        endereco.setComplemento("casa");
        endereco.setEstado("Minas Gerais");
        endereco.setNumero("75");
        endereco.setRua("Pio XII");
        endereco.setLatitude("-19.96366832");
        endereco.setLongitude("-43.409729");
    }

    @Test
    public void shouldMapEnderecoToDto(){
        /*enderecoDTO = modelMapper.map(endereco, EnderecoDTO.class);
        System.out.println(enderecoDTO.getBairro());*/
    }



}
