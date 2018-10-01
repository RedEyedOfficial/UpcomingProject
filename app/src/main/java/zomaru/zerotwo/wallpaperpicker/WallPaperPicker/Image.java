package zomaru.zerotwo.wallpaperpicker.WallPaperPicker;

import android.os.Parcel;
import android.os.Parcelable;

public class Image implements Parcelable{
    private String name;
    private String link;

    public Image (String name, String link) {
        this.name = name;
        this.link = link;

    }

    protected Image(Parcel parcel) {
        name = parcel.readString();
        link = parcel.readString();
    }

    public static final Creator<Image> CREATOR = new Creator<Image>() {
        @Override
        public Image createFromParcel(Parcel parcel) {
            return new Image(parcel);
        }

        @Override
        public Image[] newArray(int i) {
            return new Image[i];
        }
    };

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public static Image[] getPhoto () {
        return new Image[]{
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/13/b7/36/13b7360f8a723e972b795504e07e427b.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/f8/55/aa/f855aa1e90dcfd9fa142d5813d99eda3.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/17/a6/6f/17a66fa7db3e6dcc286aded7fad332ec.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/ba/37/2f/ba372f9bc78a73b56374f44957ca1f82.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/dc/46/f5/dc46f53edf708aeadc74d94a6a2f8f40.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/83/52/3c/83523c40249018b83b369284e4f3ce33.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/77/59/ab/7759ab979ff5ba51297892118db68084.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/c3/81/16/c38116ca021193b679bced04fae9e1bd.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/e9/bf/9a/e9bf9a6f3f9ca3240666f7bcea0f9833.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/ba/b6/34/bab6341522e56d83b4ecd234f8f02292.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/58/77/de/5877def2a84271b71b6c124bc9e0f3fc.png"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/e2/20/5a/e2205aad2e1ffcee4d03c3881399575d.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/67/b3/1f/67b31fd88dd5c5c356b155b07e0bdbd0.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/b5/3e/5e/b53e5ef5ab337d0ba8b32c9ebb2379ba.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/ac/e6/d6/ace6d6b6b4b1288fc65ab16394804955.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/b6/7c/96/b67c965f729c8899a08047450aa43f92.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/98/69/7b/98697b32c42415b0c038058bd31f53cd.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/ad/f2/22/adf222d407f06817f4c08a065f372b5e.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/71/3e/6e/713e6eff804ad9d66a1db9b8a80526db.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/77/08/df/7708dfe8b6dad838400dffdb8d0589ee.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/3f/77/a5/3f77a57fc2b1c24181e82c1802b77751.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/60/2c/58/602c5837dd21e0825f4d820e3370ea2a.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/c8/33/10/c83310cb1251a85bc49a8e50b5a0a765.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/d0/81/fb/d081fb5f8a4f7ff04abd4529f3b482b3.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/1d/8e/ce/1d8ecea7f6f06a110b86dcd670da0463.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/96/c6/f5/96c6f511c292f18075870393e879935b.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/3d/b2/ed/3db2ed69b61963d85fe768c215dafee8.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/94/d0/12/94d012ea0f056b556d22438114c1b4c2.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/a1/59/fe/a159fe201bf734c21027d819b0c36294.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/0b/0a/59/0b0a59b3562e2e12c3eab1e46105aa37.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/86/67/5a/86675a7627bb58f540875b9ee6ae7535.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/a4/05/ac/a405ac09b5e56426e0b79934abde72c9.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/3a/d1/28/3ad12836da03803d1c6f41d33fb6cbbb.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/fd/51/39/fd51391f42a9222493c5be26dc6e3a32.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/e1/b6/17/e1b6175297979c72ce92bd2e1791be14.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/d9/20/49/d92049357cf60b08ef3d2439ae81dec6.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/8a/b1/dd/8ab1ddc33139a1a62749a526b0448185.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/43/02/59/4302593d46ed8aae6c5e46ebdde55573.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/43/24/4a/43244ad720343c6d56f38c911091719b.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/82/32/8f/82328f08e2db6ab903da841d86833703.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/d2/23/52/d22352a30e48397408dbc3138466dc70.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/f7/64/74/f76474bbb9a434cecfaf78476ff969fc.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/78/2a/6d/782a6d70df5b5feb52ac3fcff7f1403a.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/98/00/ce/9800ce66a6dbd611ab6bdf1fa7bbfc29.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/8a/e5/50/8ae550e91149ef7423f29a97f531bf82.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/22/b7/63/22b763842d397ad3a1959675cd8af735.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/11/52/92/1152924b4f6cc988d2246ac1c91fe3ad.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/d5/0d/5c/d50d5c868a5cf4a409419411b7e47f38.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/c5/3c/27/c53c277c06c363dab1f292bc6e656937.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/f9/e2/bc/f9e2bc7e13ded872f559ca2deef6f7e3.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/e3/58/e7/e358e717be46fb875e6548e3d49839bd.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/fe/20/81/fe208184ceb36449bad59d1718fb4380.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/82/8a/1e/828a1ed50cb53acf271063fd34b3f26a.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/9c/34/77/9c3477a2b2f5dcf177cd87d47986d09d.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/6c/56/7e/6c567e298b929994f86e440136af32f6.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/bd/fe/96/bdfe96b60ee203ec90bbe74022410287.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/b6/61/1c/b6611ccda6ce9e7d71f0f21feca20a92.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/f2/51/c8/f251c8a345ee6dbc4a0afbb5eec02c4c.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/9e/93/4e/9e934e1e0a2940926a9c6df1fe2e0d24.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/b6/38/8a/b6388a956b5ed2047fcf08cbf1c9d1d3.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/8d/47/85/8d4785cf8b70203b1f2d02704f1b0cf7.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/20/7f/69/207f69516c278544782442c490de98e6.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/d4/2b/3a/d42b3a669e89ec0d7c987218c5c46bbd.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/c4/fa/f2/c4faf23de19cb19946b31e8717ab514c.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/31/8a/90/318a907a1204211a43bb48e7efc9685c.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/10/7f/2f/107f2f3e25840006a1e66d76a91d469e.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/93/a4/57/93a4574919fd3c4a83169756ed69e17c.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/bf/95/85/bf9585ee236b72583a3936d9826eedd7.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/f0/d2/41/f0d2412dca9b540fe0a54601ac876fe9.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/5b/e1/14/5be11403b30d18f80b276a1ad83f8adf.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/e8/0e/34/e80e34ae9913fdf9bfd0b96affda18ad.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/b0/17/73/b017737bfab4826c11844b2756d3abb5.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/1a/93/1e/1a931e29eb3e9c2f3242ae67f8f4c201.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/c0/94/a2/c094a2ca30a97f1553b124dece9bc5c6.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/b5/01/e3/b501e3de455ef47bbde0674c7559a970.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/ea/1d/3b/ea1d3b4154af45163a82ab4547ae017f.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/fb/91/ac/fb91ace8cda45f4c8163590834abad9c.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/81/94/b5/8194b528984e64cdeddf6c0f90613bbd.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/a4/e3/66/a4e3663aab5462baa1fa147f8dfecba4.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/b3/6f/8f/b36f8f4a923c632a7f8bc505041542b6.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/ae/40/48/ae4048beed9cd5b39a6f12ea80e878e6.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/2f/75/81/2f7581da35f78c34d4f1cb6029f2aa25.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/7d/52/44/7d5244d6413d5eef5ebc789a9110562d.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/12/b1/fe/12b1fe1ec39021ab739a27fb5fc92f49.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/6f/7d/05/6f7d05df3a8bc192189dbc2698eaf164.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/e6/e1/aa/e6e1aa62bae2718a652fd41188b40aa6.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/dc/3a/4c/dc3a4c8738520faab1a6eb71cc86fdf8.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/ee/8d/0c/ee8d0c6da06d85d581df4d50e0545faf.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/52/fa/9b/52fa9b283777cf4e9937a5f97f7deb65.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/da/be/ea/dabeea11b73e5e108b817b3035e6bd12.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/9b/11/5e/9b115e322ed586699f77cc4b601c453c.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/ef/b1/0a/efb10a80eb13f4b2b4c111c5d3c50d78.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/17/55/4a/17554ab16d0923b5d25f16f7111ce6f3.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/f9/d9/4b/f9d94bc511a91f53926f32f932354b2a.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/66/83/95/6683959520c95c242448815a117302d6.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/fd/e6/43/fde643242c747c5beedfc6fb7e75b7f9.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/98/f4/63/98f46335caaea3db9f7c5a62db3272be.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/ea/b1/2d/eab12d758c9d8ec19f8d88098fee210f.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/b4/fa/c0/b4fac05bfddd78400cb69c67fcadb5fd.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/3f/15/59/3f1559e543b5e74513495f4211f2eb3a.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/2f/c6/68/2fc668a4799412fb3e6c7810e9fffefe.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/fa/9a/49/fa9a497a74ffab50db71d3067bdf3cbd.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/f8/83/88/f88388bff11c4179f044d12d29563904.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/8d/80/c7/8d80c70f4c42d6a1bf1753093adfda5e.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/43/30/a5/4330a5d21f912f4537d7599bc6fcb652.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/6e/49/8d/6e498df8eb4240777e42da58ac9da2ac.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/fb/ac/a0/fbaca046abecc22ede4d14b05be80fe7.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/be/bb/17/bebb177fedddf8394f60d9f742c26e58.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/c3/cb/4e/c3cb4edf04338fb25007eba14b9e455f.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/a3/e8/19/a3e819128806879dd02bbb893b4fb218.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/cd/48/36/cd483615ebe2edc95b3b658e7f3f1637.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/40/48/ac/4048ac06cfda8eaa63545e02e4032de3.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/37/e6/b3/37e6b3cfcfb055a22dec52c25be1255e.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/aa/59/3b/aa593b24d439338ca7564f75e6de6fb2.png"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/a7/65/82/a76582c235bb9857ef122b1f54161847.jpg "),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/7c/02/a6/7c02a6f7743cc08b4fe0d1c3c3d6b6f2.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/4b/0a/99/4b0a995dabc261f3288f64318058b9c8.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/14/6c/0d/146c0d24bcd53e6e4ad5a009fa736807.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/4f/6d/05/4f6d056ebfc1ba7cad4c88f072d9ae33.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/dc/c6/b9/dcc6b9408ba7a19499d20098262218d6.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/23/5b/cf/235bcf4e05a7fffaeacdd2c591e96456.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/99/47/18/994718c58e0935560eb6b5cf2e39de20.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/9e/81/01/9e8101f2ee82bd445259f7a0341eee31.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/be/dc/54/bedc54e28472390a9afe08ad08a65295.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/d1/9b/62/d19b6282cb37da887bc515f2ddfc1656.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/4e/7f/34/4e7f34cc52d6e9cdcd80fbf699e4ea7b.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/8d/3d/e9/8d3de9cb4365e364ba17e91933908690.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/6e/58/dc/6e58dcb78707fe2dbbf0ca275794e28c.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/e5/95/b1/e595b11a1a466063172a21122f070ba6.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/6b/96/4e/6b964ea44566c2c62999956956944a31.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/a1/f4/a9/a1f4a98db2fdad77d7c160ff9f570253.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/a9/38/d6/a938d6ca627f4c0d98ae1709239f85a0.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/85/94/4b/85944bd45ca098cfe283cc798132e926.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/72/50/00/725000242a92f95f53a1013354a4c200.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/31/51/11/315111e9739a0121b9c93279ca4863ee.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/cc/2b/73/cc2b73c9e60af903734dbd7d036c879e.jpg"),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/1b/5d/d1/1b5dd1a1f1d977d44bcb8a7a55a47a74.jpg "),
                new Image("Zero Two.jpg", "https://i.pinimg.com/originals/1a/54/d3/1a54d3b6866033670b8a63ce3bff09f7.jpg"),

    };
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(link);
    }
}

