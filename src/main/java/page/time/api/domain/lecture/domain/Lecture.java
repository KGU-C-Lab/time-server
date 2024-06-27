package page.time.api.domain.lecture.domain;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = false)
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String professor;

    @NotNull
    private String name;

    @NotNull
    private String campus;

    @NotNull
    private String code;

    private Integer grade;

    private String room;

    private String time;

    @NotNull
    private Integer year;

    @NotNull
    private String semester;

    @NotNull
    private Integer credit;

    @NotNull
    private String category;

    private String college;

    private String major;

}
