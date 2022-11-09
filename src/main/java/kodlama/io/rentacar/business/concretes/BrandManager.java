package kodlama.io.rentacar.business.concretes;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //bu sinif bir business nesnesidir
public class BrandManager implements BrandService {
    //in memory olani newlemek yerine interface ile iletisim kuruyoruz ki daha sonra farkli tip veri tabanina gecebilelim
    //loosely coupled deniyor bu yaklasima
    private BrandRepository brandRepository;
    @Autowired
    public BrandManager(BrandRepository brandRepository) {

        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        //is kurallari buraya gelecek
        return brandRepository.findAll();
    }
}
