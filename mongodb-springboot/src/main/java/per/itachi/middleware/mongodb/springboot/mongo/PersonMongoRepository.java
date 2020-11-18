package per.itachi.middleware.mongodb.springboot.mongo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import per.itachi.middleware.mongodb.springboot.msg.PersonMsg;

@Repository
public class PersonMongoRepository implements MongoRepository<PersonMsg, String> {

	@Override
	public Page<PersonMsg> findAll(Pageable pageable) {
		return null;
	}

	@Override
	public <S extends PersonMsg> S save(S entity) {
		return null;
	}

	@Override
	public Optional<PersonMsg> findById(String id) {
		return null;
	}

	@Override
	public boolean existsById(String id) {
		return false;
	}

	@Override
	public Iterable<PersonMsg> findAllById(Iterable<String> ids) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void deleteById(String id) {
		
	}

	@Override
	public void delete(PersonMsg entity) {
		
	}

	@Override
	public void deleteAll(Iterable<? extends PersonMsg> entities) {
		
	}

	@Override
	public void deleteAll() {
		
	}

	@Override
	public <S extends PersonMsg> Optional<S> findOne(Example<S> example) {
		return null;
	}

	@Override
	public <S extends PersonMsg> Page<S> findAll(Example<S> example, Pageable pageable) {
		return null;
	}

	@Override
	public <S extends PersonMsg> long count(Example<S> example) {
		return 0;
	}

	@Override
	public <S extends PersonMsg> boolean exists(Example<S> example) {
		return false;
	}

	@Override
	public <S extends PersonMsg> List<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public List<PersonMsg> findAll() {
		return null;
	}

	@Override
	public List<PersonMsg> findAll(Sort sort) {
		return null;
	}

	@Override
	public <S extends PersonMsg> S insert(S entity) {
		return null;
	}

	@Override
	public <S extends PersonMsg> List<S> insert(Iterable<S> entities) {
		return null;
	}

	@Override
	public <S extends PersonMsg> List<S> findAll(Example<S> example) {
		return null;
	}

	@Override
	public <S extends PersonMsg> List<S> findAll(Example<S> example, Sort sort) {
		return null;
	}
}
