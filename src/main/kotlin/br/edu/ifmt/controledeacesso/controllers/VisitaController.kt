package br.edu.ifmt.controledeacesso.controllers

import br.edu.ifmt.controledeacesso.models.dto.VisitaDTO
import br.edu.ifmt.controledeacesso.services.VisitaService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Controlador responsável pela gestão dos endpoints referentes à entidade Visita
 * @see VisitaService
 * @see VisitaDTO
 * @see br.edu.ifmt.controledeacesso.models.entities.Visita
 *
 * @project cae-api
 * @author daohn on 06/02/2021
 */
@RestController
@RequestMapping("/visitas")
class VisitaController(private val service: VisitaService) {

  @GetMapping
  fun findAll(): ResponseEntity<List<VisitaDTO>> {
    val visitas = service.findAll()
    return ResponseEntity.ok(visitas)
  }

}