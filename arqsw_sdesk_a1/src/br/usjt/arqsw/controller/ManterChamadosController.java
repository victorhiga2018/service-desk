package br.usjt.arqsw.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.usjt.arqsw.entity.Fila;
import br.usjt.arqsw.service.FilaService;
/**
 * 
 * @author asbonato
 *
 */
@Controller
public class ManterChamadosController {
	private FilaService filaService;

	public ManterChamadosController() {
		filaService = new FilaService();
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping("index")
	public String inicio() {
		return "index";
	}

	private List<Fila> listarFilas() throws IOException{
			return filaService.listarFilas();
	}
	
	/**
	 * 
	 * @param model Acesso à request http
	 * @return JSP de Listar Chamados
	 */
	@RequestMapping("/listar_filas_exibir")
	public String listarFilasExibir(Model model) {
		try {
			model.addAttribute("filas", listarFilas());
			return "ChamadoListar";
		} catch (IOException e) {
			e.printStackTrace();
			return "Erro";
		}
	}
	
	@RequestMapping("/listar_chamados_exibir")
	public String listarChamadosExibir(@Valid Fila fila, BindingResult result, Model model) {
		try {
			if (result.hasFieldErrors("id")) {
				model.addAttribute("filas", listarFilas());
				System.out.println("Deu erro " + result.toString());
				return "ChamadoListar";
				//return "redirect:listar_filas_exibir";
			}
			fila = filaService.carregar(fila.getId());
			model.addAttribute("fila", fila);

			// TODO Código para carregar os chamados
			System.out.println("Falta implementar o restante do código.");
			
			return "ChamadoListarExibir";

		} catch (IOException e) {
			e.printStackTrace();
			return "Erro";
		}
	}

}
