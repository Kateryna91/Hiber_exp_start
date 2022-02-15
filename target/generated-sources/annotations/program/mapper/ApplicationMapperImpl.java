package program.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import program.dto.author.AuthorAddDto;
import program.dto.author.AuthorDto;
import program.entities.Author;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-13T17:47:58+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class ApplicationMapperImpl implements ApplicationMapper {

    @Override
    public AuthorDto AuthorByAuthorDto(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorDto authorDto = new AuthorDto();

        authorDto.setName( author.getFullName() );
        authorDto.setId( author.getId() );

        return authorDto;
    }

    @Override
    public List<AuthorDto> ListAuthorByListAuthorDto(List<Author> authors) {
        if ( authors == null ) {
            return null;
        }

        List<AuthorDto> list = new ArrayList<AuthorDto>( authors.size() );
        for ( Author author : authors ) {
            list.add( AuthorByAuthorDto( author ) );
        }

        return list;
    }

    @Override
    public Author AuthorByAddAuthorDto(AuthorAddDto dto) {
        if ( dto == null ) {
            return null;
        }

        Author author = new Author();

        author.setFullName( dto.getFullName() );

        return author;
    }
}
