import document.dao.DocumentDao;

public class Main {
    public static void main(String[] args) {
        var docs = DocumentDao.getInstance().getDocumentsWithNumPart(777L);
        docs.forEach(it -> {
            var outStr = new StringBuilder();
            var people = it.getPeople();
            outStr.append(people.getLastName())
                    .append(' ')
                    .append(people.getFirstName())
                    .append(' ')
                    .append(people.getMiddleName())
                    .append(' ')
                    .append(it.getDocType())
                    .append(' ')
                    .append(it.getDocNumber());
            System.out.println(outStr.toString());
        });
    }
}
