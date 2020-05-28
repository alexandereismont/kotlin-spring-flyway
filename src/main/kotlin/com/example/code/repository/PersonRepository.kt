package com.example.code.repository

import com.example.code.entity.Person
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
interface PersonRepository : CrudRepository<Person, Long>