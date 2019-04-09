package com.codenation.squad5.flemingapi.api.hospitais.service;

import com.codenation.squad5.flemingapi.api.common.model.Endereco;
import com.codenation.squad5.flemingapi.api.hospitais.HospitalController;
import com.codenation.squad5.flemingapi.api.hospitais.dto.HospitalDTO;
import com.codenation.squad5.flemingapi.api.hospitais.model.Hospital;
import com.codenation.squad5.flemingapi.api.leitos.model.Leito;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HospitalServiceImplTest {
    @Autowired
   private HospitalController hospitalController;

    private HospitalDTO hospitalDto = new HospitalDTO();
    private ModelMapper modelMapper = new ModelMapper();

    @Test
    public void shouldMapHospitalToDto(){
        Hospital hospital;
        hospital = this.setUpHospital();
        hospital.setEndereco(this.setUpEndereco());
        hospital.setLeitos(this.setUpLeitos());

        hospitalDto = modelMapper.map(hospital, HospitalDTO.class);
        assertEquals( hospitalDto.getId(),"012");
    }

    @Test
    public void naoNulo(){
        assertNotNull(hospitalDto);
    }

    @Test
    public void deveSalvar(){
        hospitalController.salvarHospital(hospitalDto);
        assertFalse(hospitalController.listarHospitais().contains(hospitalDto));
    }

    @Test
    public void quandoHospitalNaoPossuiEndereco(){
        Hospital hospital;
        hospital = this.setUpHospital();
        hospital.setLeitos(this.setUpLeitos());

        assertNull(hospital.getEndereco());
    }

     @Test
    public void quandoHospitalNaoPossuirHospital(){
         Hospital hospital = new Hospital();
         assertNull(hospital.getId());
    }

    @Test
    public void quandoHospitalNaoPossuiQualquerLeitos(){
        Hospital hospital;
        hospital = this.setUpHospital();
        hospital.setEndereco(this.setUpEndereco());

        assertEquals(hospital.getLeitos().size(), 0);
    }

    public Endereco setUpEndereco(){
        Endereco endereco = new Endereco();
        endereco.setBairro("Centro");
        endereco.setCep("35.960-000");
        endereco.setCidade("Santa Barbara");
        endereco.setComplemento("casa");
        endereco.setEstado("Minas Gerais");
        endereco.setNumero("75");
        endereco.setRua("Pio XII");
        endereco.setLatitude("-19.96366832");
        endereco.setLongitude("-43.409729");
        return endereco;
    }

    public List<Leito> setUpLeitos(){
        List<Leito> leitos = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            Leito leito = new Leito();
            leito.setNumero(i); leito.setOcupado(false);
            leitos.add(leito);
        }
        return leitos;
    }

    public Hospital setUpHospital(){
        Hospital hospital = new Hospital();
        hospital.setId("012");
        hospital.setNome("Santa Casa");

        return hospital;
    }

}
