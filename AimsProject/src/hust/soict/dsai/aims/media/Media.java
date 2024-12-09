package hust.soict.dsai.aims.media;

import java.util.Comparator;
import java.util.Random;

public abstract class Media implements Comparable<Media> {
	private static int id_counter = 0;
    private int id;
	private String title;
	private String category;
	private float cost;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

	public Media() {
		this.id = new Random().nextInt(1_000_000) + 1;
		this.title = "";
		this.category = "";
		this.cost = 0.0f;
	}

	public Media(int id, String title, String category, float cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public Media(String title) {
		this.title = title;
		id_counter++;
		this.id = id_counter;
	}
	public Media(String title, String category) {
		this.title = title;
		this.category = category;
		id_counter++;
		this.id = id_counter;
	}
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}

	@Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Media)) {
            return false;
        }

        Media other = (Media) obj;
        return this.title != null && this.title.equals(other.title);
    }
	public static Comparator<Media> getCompareByCostTitle() {
		return COMPARE_BY_COST_TITLE;
	}
	public static Comparator<Media> getCompareByTitleCost() {
		return COMPARE_BY_TITLE_COST;
	}
	@Override
    public int compareTo(Media other) {
        int titleComparison = this.title.compareTo(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        }
        // If titles are the same, compare by cost (higher cost first)
        return Double.compare(other.cost, this.cost);
    }
}
