package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Question")
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @Id
    @Column
    private long questionary_id;

    @Id
    @Column
    private long question_id;

    @Column
    private long question_name;

    @Column
    private String question_type;

    @Column
    private String possible_answers;

    public long getQuestionary_id() {
        return questionary_id;
    }

    public void setQuestionary_id(long questionary_id) {
        this.questionary_id = questionary_id;
    }

    public long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(long question_id) {
        this.question_id = question_id;
    }

    public long getQuestion_name() {
        return question_name;
    }

    public void setQuestion_name(long question_name) {
        this.question_name = question_name;
    }

    public String getQuestion_type() {
        return question_type;
    }

    public void setQuestion_type(String question_type) {
        this.question_type = question_type;
    }

    public String getPossible_answers() {
        return possible_answers;
    }

    public void setPossible_answers(String possible_answers) {
        this.possible_answers = possible_answers;
    }
}
