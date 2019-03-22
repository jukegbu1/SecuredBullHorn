package com.example.demo.repositories;

import com.example.demo.beans.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message,Long> {
}
