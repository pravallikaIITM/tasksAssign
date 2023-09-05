package com.example.demo.service;

import com.example.demo.dao.TasksRepository;
import com.example.demo.util.Tasks;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Configuration
public class TaskConfiguration {

    @Bean
    public TasksRepository beanOne() {
        return new TasksRepository() {
            @Override
            public void flush() {

            }

            @Override
            public <S extends Tasks> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Tasks> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Tasks> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Tasks getOne(Long aLong) {
                return null;
            }

            @Override
            public Tasks getById(Long aLong) {
                return null;
            }

            @Override
            public Tasks getReferenceById(Long aLong) {
                return null;
            }

            @Override
            public <S extends Tasks> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Tasks> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends Tasks> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public List<Tasks> findAll() {
                return null;
            }

            @Override
            public List<Tasks> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public <S extends Tasks> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Tasks> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(Tasks entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends Tasks> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public List<Tasks> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<Tasks> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Tasks> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Tasks> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Tasks> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Tasks> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends Tasks, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        };
    }

}
