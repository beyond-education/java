package academy.beyondeducation.part2_different;

public class FileContentService {
    public String everyETo3(String originalContent) {
        return originalContent.chars()
                .map(c->c =='e' || c =='E'? '3' : c)
                .collect(StringBuilder::new, (sb, c)->sb.append(Character.toString(c)), StringBuilder::append)
                .toString();
    }
}
