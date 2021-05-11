@Entity
@Table(name="user")
public class User{
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @OneToMany(mappedBy="createdBy")
    private List<BlogPost> blogPost;





}