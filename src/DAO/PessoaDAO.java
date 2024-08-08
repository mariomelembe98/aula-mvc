package DAO;

import Models.Pessoa;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class PessoaDAO<T extends Pessoa> {
    private final String fileName;

    public PessoaDAO(String fileName) {
        this.fileName = fileName;
    }

    public void save(T person) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName, true))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<T> findAll() {
        List<T> persons = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                T person = (T) ois.readObject();
                persons.add(person);
            }
        } catch (EOFException e) {
            // Fim do arquivo
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }

    public void delete(int id) {
        List<T> persons = findAll();
        persons.removeIf(person -> person.getId() == id);
        saveAll(persons);
    }

    public void update(T person) {
        List<T> persons = findAll();
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getId() == person.getId()) {
                persons.set(i, person);
                break;
            }
        }
        saveAll(persons);
    }

    private void saveAll(List<T> persons) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            for (T person : persons) {
                oos.writeObject(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
