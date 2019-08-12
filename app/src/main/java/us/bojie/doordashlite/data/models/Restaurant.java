package us.bojie.doordashlite.data.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class Restaurant {

    /**
     * is_time_surging : false
     * max_order_size : null
     * delivery_fee : 0
     * max_composite_score : 10
     * id : 236
     * merchant_promotions : [{"minimum_subtotal_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"delivery_fee":null,"delivery_fee_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"minimum_subtotal":null,"new_store_customers_only":false,"id":15215},{"minimum_subtotal_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"delivery_fee":null,"delivery_fee_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"minimum_subtotal":null,"new_store_customers_only":false,"id":18429},{"minimum_subtotal_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"delivery_fee":null,"delivery_fee_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"minimum_subtotal":null,"new_store_customers_only":false,"id":7613},{"minimum_subtotal_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"delivery_fee":null,"delivery_fee_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"minimum_subtotal":null,"new_store_customers_only":false,"id":6342},{"minimum_subtotal_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"delivery_fee":null,"delivery_fee_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"minimum_subtotal":null,"new_store_customers_only":false,"id":6340},{"minimum_subtotal_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"delivery_fee":null,"delivery_fee_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"minimum_subtotal":null,"new_store_customers_only":false,"id":6338},{"minimum_subtotal_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"delivery_fee":null,"delivery_fee_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"minimum_subtotal":null,"new_store_customers_only":false,"id":6337},{"minimum_subtotal_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"delivery_fee":null,"delivery_fee_monetary_fields":{"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2},"minimum_subtotal":null,"new_store_customers_only":false,"id":168}]
     * average_rating : 4.7
     * menus : [{"popular_items":[{"price":695,"description":"Choose 5, 10, 20 or 50 pieces","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/64743380-9321-48f8-acee-d5cdcde3fe49-retina-large.jpg","id":25371204,"name":"Flame Roasted Lemon Chicken Wings"},{"price":695,"description":"Crisp romaine, house-made croutons, freshly grated parmesan. Served with Caesar dressing.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/50f925b4-a8f1-48dd-9dee-acef394ff27b-retina-large.jpg","id":25371251,"name":"Caesar Salad"},{"price":1275,"description":"Vegetarian.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/9a1f55d8-2e96-4a3a-9e1c-a2c75cbd20ff-retina-large.jpg","id":25371092,"name":"Fettuccine Alfredo"},{"price":325,"description":"Vegetarian. Choose between 6 or 12 pieces. Complementary side of dressing.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/1ef685c6-49e8-44da-9661-f4a941a79b68-retina-large.jpg","id":25371203,"name":"Garlic Breadsticks"},{"price":450,"description":"","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/1e8cc0ef-96ea-47bd-92b4-376ce2b5a3ad-retina-large.jpg","id":25371199,"name":"Beef Meatballs (3)"},{"price":950,"description":"Vegetarian. Mozzarella and Tomato sauce.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/dab84e51-f028-4b4a-920d-769098333273-retina-large.jpg","id":81510821,"name":"New York"},{"price":1375,"description":"Pepperoni, meatball, bacon, sautéed mushrooms, black olives.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/cdc9131d-a78d-44fa-823a-62dbcd42d549-retina-large.jpg","id":25371190,"name":"Amicis Combo"},{"price":1075,"description":"Vegetarian. Mozzarella, tomatoes, fresh basil, olive oil.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/39fa22f9-4edd-4061-9add-8fd81702b474-retina-large.jpg","id":25371193,"name":"Margherita"},{"price":450,"description":"Vegetarian.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/5edbcb31-bc33-43c9-8553-f6ca18f0fb29-retina-large.jpg","id":25371200,"name":"Minestrone Soup"},{"price":775,"description":"New. Vegan. With garlic, hot pepper flakes, fresh lemon juice.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/a5ee5794-0494-4dc7-99e0-ec9fb312683c-retina-large.jpg","id":25371195,"name":"Pan Roasted Broccoli"},{"price":895,"description":"New. Vegetarian. Orecchiette in a creamy cheese sauce, baked with crispy toasted breadcrumbs.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/943cf6e5-9358-4877-9ecd-ad44c06a0f86-retina-large.jpg","id":25371196,"name":"Mac n Cheese"},{"price":595,"description":"Vegan. Crisp romaine, tomato, red onion, green pepper.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/dea854e2-5b12-4cf9-b156-c12f28702372-retina-large.jpg","id":25371253,"name":"Garden Salad"},{"price":1275,"description":"Whole wheat spaghetti (or your choice of other noodle) with marinara.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/08a12a8f-c477-4290-94bb-6480eac3f94e-retina-large.jpg","id":25371116,"name":"Spaghetti & Meatballs"},{"price":1275,"description":"","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/981f6f5c-0c35-415d-8e6c-82b909101a41-retina-large.jpg","id":25371119,"name":"Penne with Meat Sauce"},{"price":795,"description":"With roasted red peppers, red onion, tomato, bacon, crumbled feta, toasted pine nuts. Served with lemon basil vinaigrette.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/cf715675-5a94-499e-9a50-de44431a9725-retina-large.jpg","id":25371258,"name":"Spinach Salad"},{"price":1475,"description":"","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/73f1b1d8-9572-4941-89ef-724fcbd01044-retina-large.jpg","id":25371093,"name":"Four Cheese Lasagna with Meat Sauce"},{"price":1250,"description":"Italian salami, pepperoncini, whole kalamata olives, mozzarella added to garden salad.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/a6db4073-4661-445d-b397-7415869acbde-retina-large.jpg","id":74032512,"name":"Antipasto Salad"},{"price":1275,"description":"Vegetarian.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/9f2462c7-e181-4c1a-a8fe-ed6510e3978f-retina-large.jpg","id":25371110,"name":"Linguine with Pesto"},{"price":1275,"description":"Vegetarian.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/8760a6e8-5bd2-4a7b-8165-95dacbc20411-retina-large.jpg","id":25371106,"name":"Cheese Ravioli with Marinara"},{"price":850,"description":"","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/c1d04401-a770-41c5-bfe4-d1049f8d0ddc-retina-large.jpg","id":25371075,"name":"Meatball Parmigiana"},{"price":1275,"description":"Vegetarian. Roasted green peppers, sautéed mushrooms, caramelized onions, black olives.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/500698db-f4dc-4831-953f-857858fe75fa-retina-large.jpg","id":25371153,"name":"Veggie"},{"price":1775,"description":"","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/460cb524-1bf8-4e6b-9c3f-5089998b32ad-retina-large.jpg","id":25371096,"name":"Chicken Parmigiana"},{"price":1050,"description":"Vegetarian. With cherry tomatoes, red onions, toasted pine nuts, ricotta salata. Served with balsamic shallot vinaigrette.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/115bc0e7-35cd-4369-b5c9-0b0340c1c44f-retina-large.jpg","id":25371260,"name":"Kale & Quinoa Salad"}],"is_catering":false,"subtitle":"All Day","id":259502,"name":"Amici's East Coast Pizzeria (All Day) (Non SF)"}]
     * composite_score : 9
     * status_type : open
     * is_only_catering : false
     * status : 48 mins
     * number_of_ratings : 4215
     * asap_time : 48
     * description : Pizza, Italian, Caterers
     * business : {"id":228,"name":"Amici's East Coast Pizzeria"}
     * tags : ["Pizza","Italian","Caterers"]
     * yelp_review_count : 182
     * business_id : 228
     * extra_sos_delivery_fee : 0
     * yelp_rating : 3.5
     * cover_img_url : https://cdn.doordash.com/media/restaurant/cover/amicis.png
     * header_img_url : https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/64743380-9321-48f8-acee-d5cdcde3fe49-retina-large.jpg
     * address : {"city":"Menlo Park","state":"CA","street":"880 Santa Cruz Avenue","lat":37.450266,"lng":-122.186049,"printable_address":"880 Santa Cruz Avenue, Menlo Park, CA 94025, USA"}
     * price_range : 2
     * slug : amici-s-east-coast-pizzeria-menlo-park
     * name : Amici's East Coast Pizzeria (Menlo Park)
     * is_newly_added : false
     * url : /store/amici-s-east-coast-pizzeria-menlo-park-236/
     * service_rate : 11
     * promotion : null
     * featured_category_description : null
     */

    @SerializedName("is_time_surging")
    private boolean isTimeSurging;
    @SerializedName("delivery_fee")
    private int deliveryFee;
    @SerializedName("max_composite_score")
    private int maxCompositeScore;
    @SerializedName("id")
    private int id;
    @SerializedName("average_rating")
    private String averageRating;
    @SerializedName("composite_score")
    private int compositeScore;
    @SerializedName("status_type")
    private String statusType;
    @SerializedName("is_only_catering")
    private boolean isOnlyCatering;
    @SerializedName("status")
    private String status;
    @SerializedName("number_of_ratings")
    private int numberOfRatings;
    @SerializedName("asap_time")
    private int asapTime;
    @SerializedName("description")
    private String description;
    @SerializedName("business")
    private BusinessBean business;
    @SerializedName("yelp_review_count")
    private int yelpReviewCount;
    @SerializedName("business_id")
    private int businessId;
    @SerializedName("extra_sos_delivery_fee")
    private int extraSosDeliveryFee;
    @SerializedName("yelp_rating")
    private double yelpRating;
    @SerializedName("cover_img_url")
    private String coverImgUrl;
    @SerializedName("header_img_url")
    private String headerImgUrl;
    @SerializedName("address")
    private AddressBean address;
    @SerializedName("price_range")
    private int priceRange;
    @SerializedName("slug")
    private String slug;
    @SerializedName("name")
    private String name;
    @SerializedName("is_newly_added")
    private boolean isNewlyAdded;
    @SerializedName("url")
    private String url;
    @SerializedName("service_rate")
    private int serviceRate;
    @SerializedName("merchant_promotions")
    private List<MerchantPromotionsBean> merchantPromotions;
    @SerializedName("menus")
    private List<MenusBean> menus;
    @SerializedName("tags")
    private List<String> tags;

    public boolean isIsTimeSurging() {
        return isTimeSurging;
    }

    public void setIsTimeSurging(boolean isTimeSurging) {
        this.isTimeSurging = isTimeSurging;
    }

    public int getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(int deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public int getMaxCompositeScore() {
        return maxCompositeScore;
    }

    public void setMaxCompositeScore(int maxCompositeScore) {
        this.maxCompositeScore = maxCompositeScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }

    public int getCompositeScore() {
        return compositeScore;
    }

    public void setCompositeScore(int compositeScore) {
        this.compositeScore = compositeScore;
    }

    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    public boolean isIsOnlyCatering() {
        return isOnlyCatering;
    }

    public void setIsOnlyCatering(boolean isOnlyCatering) {
        this.isOnlyCatering = isOnlyCatering;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public int getAsapTime() {
        return asapTime;
    }

    public void setAsapTime(int asapTime) {
        this.asapTime = asapTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BusinessBean getBusiness() {
        return business;
    }

    public void setBusiness(BusinessBean business) {
        this.business = business;
    }

    public int getYelpReviewCount() {
        return yelpReviewCount;
    }

    public void setYelpReviewCount(int yelpReviewCount) {
        this.yelpReviewCount = yelpReviewCount;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public int getExtraSosDeliveryFee() {
        return extraSosDeliveryFee;
    }

    public void setExtraSosDeliveryFee(int extraSosDeliveryFee) {
        this.extraSosDeliveryFee = extraSosDeliveryFee;
    }

    public double getYelpRating() {
        return yelpRating;
    }

    public void setYelpRating(double yelpRating) {
        this.yelpRating = yelpRating;
    }

    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl;
    }

    public String getHeaderImgUrl() {
        return headerImgUrl;
    }

    public void setHeaderImgUrl(String headerImgUrl) {
        this.headerImgUrl = headerImgUrl;
    }

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    public int getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(int priceRange) {
        this.priceRange = priceRange;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsNewlyAdded() {
        return isNewlyAdded;
    }

    public void setIsNewlyAdded(boolean isNewlyAdded) {
        this.isNewlyAdded = isNewlyAdded;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(int serviceRate) {
        this.serviceRate = serviceRate;
    }

    public List<MerchantPromotionsBean> getMerchantPromotions() {
        return merchantPromotions;
    }

    public void setMerchantPromotions(List<MerchantPromotionsBean> merchantPromotions) {
        this.merchantPromotions = merchantPromotions;
    }

    public List<MenusBean> getMenus() {
        return menus;
    }

    public void setMenus(List<MenusBean> menus) {
        this.menus = menus;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public static class BusinessBean {
        /**
         * id : 228
         * name : Amici's East Coast Pizzeria
         */

        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class AddressBean {
        /**
         * city : Menlo Park
         * state : CA
         * street : 880 Santa Cruz Avenue
         * lat : 37.450266
         * lng : -122.186049
         * printable_address : 880 Santa Cruz Avenue, Menlo Park, CA 94025, USA
         */

        @SerializedName("city")
        private String city;
        @SerializedName("state")
        private String state;
        @SerializedName("street")
        private String street;
        @SerializedName("lat")
        private double lat;
        @SerializedName("lng")
        private double lng;
        @SerializedName("printable_address")
        private String printableAddress;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }

        public String getPrintableAddress() {
            return printableAddress;
        }

        public void setPrintableAddress(String printableAddress) {
            this.printableAddress = printableAddress;
        }
    }

    public static class MerchantPromotionsBean {
        /**
         * minimum_subtotal_monetary_fields : {"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2}
         * delivery_fee : null
         * delivery_fee_monetary_fields : {"currency":"USD","display_string":"$0.00","unit_amount":null,"decimal_places":2}
         * minimum_subtotal : null
         * new_store_customers_only : false
         * id : 15215
         */

        @SerializedName("minimum_subtotal_monetary_fields")
        private MinimumSubtotalMonetaryFieldsBean minimumSubtotalMonetaryFields;
        @SerializedName("delivery_fee_monetary_fields")
        private DeliveryFeeMonetaryFieldsBean deliveryFeeMonetaryFields;
        @SerializedName("minimum_subtotal")
        private Object minimumSubtotal;
        @SerializedName("new_store_customers_only")
        private boolean newStoreCustomersOnly;
        @SerializedName("id")
        private int id;

        public MinimumSubtotalMonetaryFieldsBean getMinimumSubtotalMonetaryFields() {
            return minimumSubtotalMonetaryFields;
        }

        public void setMinimumSubtotalMonetaryFields(MinimumSubtotalMonetaryFieldsBean minimumSubtotalMonetaryFields) {
            this.minimumSubtotalMonetaryFields = minimumSubtotalMonetaryFields;
        }

        public DeliveryFeeMonetaryFieldsBean getDeliveryFeeMonetaryFields() {
            return deliveryFeeMonetaryFields;
        }

        public void setDeliveryFeeMonetaryFields(DeliveryFeeMonetaryFieldsBean deliveryFeeMonetaryFields) {
            this.deliveryFeeMonetaryFields = deliveryFeeMonetaryFields;
        }

        public Object getMinimumSubtotal() {
            return minimumSubtotal;
        }

        public void setMinimumSubtotal(Object minimumSubtotal) {
            this.minimumSubtotal = minimumSubtotal;
        }

        public boolean isNewStoreCustomersOnly() {
            return newStoreCustomersOnly;
        }

        public void setNewStoreCustomersOnly(boolean newStoreCustomersOnly) {
            this.newStoreCustomersOnly = newStoreCustomersOnly;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public static class MinimumSubtotalMonetaryFieldsBean {
            /**
             * currency : USD
             * display_string : $0.00
             * unit_amount : null
             * decimal_places : 2
             */

            @SerializedName("currency")
            private String currency;
            @SerializedName("display_string")
            private String displayString;
            @SerializedName("decimal_places")
            private int decimalPlaces;

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDisplayString() {
                return displayString;
            }

            public void setDisplayString(String displayString) {
                this.displayString = displayString;
            }

            public int getDecimalPlaces() {
                return decimalPlaces;
            }

            public void setDecimalPlaces(int decimalPlaces) {
                this.decimalPlaces = decimalPlaces;
            }
        }

        public static class DeliveryFeeMonetaryFieldsBean {
            /**
             * currency : USD
             * display_string : $0.00
             * unit_amount : null
             * decimal_places : 2
             */

            @SerializedName("currency")
            private String currency;
            @SerializedName("display_string")
            private String displayString;
            @SerializedName("decimal_places")
            private int decimalPlaces;

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDisplayString() {
                return displayString;
            }

            public void setDisplayString(String displayString) {
                this.displayString = displayString;
            }

            public int getDecimalPlaces() {
                return decimalPlaces;
            }

            public void setDecimalPlaces(int decimalPlaces) {
                this.decimalPlaces = decimalPlaces;
            }
        }
    }

    public static class MenusBean {
        /**
         * popular_items : [{"price":695,"description":"Choose 5, 10, 20 or 50 pieces","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/64743380-9321-48f8-acee-d5cdcde3fe49-retina-large.jpg","id":25371204,"name":"Flame Roasted Lemon Chicken Wings"},{"price":695,"description":"Crisp romaine, house-made croutons, freshly grated parmesan. Served with Caesar dressing.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/50f925b4-a8f1-48dd-9dee-acef394ff27b-retina-large.jpg","id":25371251,"name":"Caesar Salad"},{"price":1275,"description":"Vegetarian.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/9a1f55d8-2e96-4a3a-9e1c-a2c75cbd20ff-retina-large.jpg","id":25371092,"name":"Fettuccine Alfredo"},{"price":325,"description":"Vegetarian. Choose between 6 or 12 pieces. Complementary side of dressing.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/1ef685c6-49e8-44da-9661-f4a941a79b68-retina-large.jpg","id":25371203,"name":"Garlic Breadsticks"},{"price":450,"description":"","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/1e8cc0ef-96ea-47bd-92b4-376ce2b5a3ad-retina-large.jpg","id":25371199,"name":"Beef Meatballs (3)"},{"price":950,"description":"Vegetarian. Mozzarella and Tomato sauce.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/dab84e51-f028-4b4a-920d-769098333273-retina-large.jpg","id":81510821,"name":"New York"},{"price":1375,"description":"Pepperoni, meatball, bacon, sautéed mushrooms, black olives.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/cdc9131d-a78d-44fa-823a-62dbcd42d549-retina-large.jpg","id":25371190,"name":"Amicis Combo"},{"price":1075,"description":"Vegetarian. Mozzarella, tomatoes, fresh basil, olive oil.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/39fa22f9-4edd-4061-9add-8fd81702b474-retina-large.jpg","id":25371193,"name":"Margherita"},{"price":450,"description":"Vegetarian.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/5edbcb31-bc33-43c9-8553-f6ca18f0fb29-retina-large.jpg","id":25371200,"name":"Minestrone Soup"},{"price":775,"description":"New. Vegan. With garlic, hot pepper flakes, fresh lemon juice.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/a5ee5794-0494-4dc7-99e0-ec9fb312683c-retina-large.jpg","id":25371195,"name":"Pan Roasted Broccoli"},{"price":895,"description":"New. Vegetarian. Orecchiette in a creamy cheese sauce, baked with crispy toasted breadcrumbs.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/943cf6e5-9358-4877-9ecd-ad44c06a0f86-retina-large.jpg","id":25371196,"name":"Mac n Cheese"},{"price":595,"description":"Vegan. Crisp romaine, tomato, red onion, green pepper.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/dea854e2-5b12-4cf9-b156-c12f28702372-retina-large.jpg","id":25371253,"name":"Garden Salad"},{"price":1275,"description":"Whole wheat spaghetti (or your choice of other noodle) with marinara.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/08a12a8f-c477-4290-94bb-6480eac3f94e-retina-large.jpg","id":25371116,"name":"Spaghetti & Meatballs"},{"price":1275,"description":"","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/981f6f5c-0c35-415d-8e6c-82b909101a41-retina-large.jpg","id":25371119,"name":"Penne with Meat Sauce"},{"price":795,"description":"With roasted red peppers, red onion, tomato, bacon, crumbled feta, toasted pine nuts. Served with lemon basil vinaigrette.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/cf715675-5a94-499e-9a50-de44431a9725-retina-large.jpg","id":25371258,"name":"Spinach Salad"},{"price":1475,"description":"","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/73f1b1d8-9572-4941-89ef-724fcbd01044-retina-large.jpg","id":25371093,"name":"Four Cheese Lasagna with Meat Sauce"},{"price":1250,"description":"Italian salami, pepperoncini, whole kalamata olives, mozzarella added to garden salad.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/a6db4073-4661-445d-b397-7415869acbde-retina-large.jpg","id":74032512,"name":"Antipasto Salad"},{"price":1275,"description":"Vegetarian.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/9f2462c7-e181-4c1a-a8fe-ed6510e3978f-retina-large.jpg","id":25371110,"name":"Linguine with Pesto"},{"price":1275,"description":"Vegetarian.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/8760a6e8-5bd2-4a7b-8165-95dacbc20411-retina-large.jpg","id":25371106,"name":"Cheese Ravioli with Marinara"},{"price":850,"description":"","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/c1d04401-a770-41c5-bfe4-d1049f8d0ddc-retina-large.jpg","id":25371075,"name":"Meatball Parmigiana"},{"price":1275,"description":"Vegetarian. Roasted green peppers, sautéed mushrooms, caramelized onions, black olives.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/500698db-f4dc-4831-953f-857858fe75fa-retina-large.jpg","id":25371153,"name":"Veggie"},{"price":1775,"description":"","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/460cb524-1bf8-4e6b-9c3f-5089998b32ad-retina-large.jpg","id":25371096,"name":"Chicken Parmigiana"},{"price":1050,"description":"Vegetarian. With cherry tomatoes, red onions, toasted pine nuts, ricotta salata. Served with balsamic shallot vinaigrette.","img_url":"https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/115bc0e7-35cd-4369-b5c9-0b0340c1c44f-retina-large.jpg","id":25371260,"name":"Kale & Quinoa Salad"}]
         * is_catering : false
         * subtitle : All Day
         * id : 259502
         * name : Amici's East Coast Pizzeria (All Day) (Non SF)
         */

        @SerializedName("is_catering")
        private boolean isCatering;
        @SerializedName("subtitle")
        private String subtitle;
        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;
        @SerializedName("popular_items")
        private List<PopularItemsBean> popularItems;

        public boolean isIsCatering() {
            return isCatering;
        }

        public void setIsCatering(boolean isCatering) {
            this.isCatering = isCatering;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<PopularItemsBean> getPopularItems() {
            return popularItems;
        }

        public void setPopularItems(List<PopularItemsBean> popularItems) {
            this.popularItems = popularItems;
        }

        public static class PopularItemsBean {
            /**
             * price : 695
             * description : Choose 5, 10, 20 or 50 pieces
             * img_url : https://res.cloudinary.com/doordash/image/fetch/c_fill,w_1200,h_672,q_auto:eco,f_auto/https://doordash-static.s3.amazonaws.com/media/photos/64743380-9321-48f8-acee-d5cdcde3fe49-retina-large.jpg
             * id : 25371204
             * name : Flame Roasted Lemon Chicken Wings
             */

            @SerializedName("price")
            private int price;
            @SerializedName("description")
            private String description;
            @SerializedName("img_url")
            private String imgUrl;
            @SerializedName("id")
            private int id;
            @SerializedName("name")
            private String name;

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public static DiffUtil.ItemCallback<Restaurant> DIFF_CALLBACK = new DiffUtil.ItemCallback<Restaurant>() {
        @Override
        public boolean areItemsTheSame(@NonNull Restaurant oldItem, @NonNull Restaurant newItem) {
            return oldItem.id == newItem.id;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Restaurant oldItem, @NonNull Restaurant newItem) {
            return oldItem.equals(newItem);
        }
    };

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        Restaurant restaurant = (Restaurant) obj;
        return restaurant.id == this.id;
    }
}
