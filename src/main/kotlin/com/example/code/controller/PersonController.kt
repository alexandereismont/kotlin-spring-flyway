package com.example.code.controller

import com.example.code.controller.dto.PersonId
import com.example.code.entity.Person
import com.example.code.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/person")
class PersonController @Autowired constructor(private val personRepository: PersonRepository) {

    @GetMapping("/all")
    fun getAllPeople() : MutableIterable<Person> {
        return personRepository.findAll()
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    fun addPerson(@RequestBody person: Person): Person {
        return personRepository.save(person)
    }

    @PostMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    fun findById(@RequestBody personId: PersonId){
        personRepository.findById(personId.personId)
    }

}
