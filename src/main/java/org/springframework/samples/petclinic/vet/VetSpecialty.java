/*
 * Copyright 2012-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.vet;

/**
 * Reference between {@link Vet} and {@link Specialty} required to have many to many relationships in Spring Data JDBC.
 *
 * @author Maciej Walkowiak
 */
public class VetSpecialty {
    private Long specialty;
    private Long vet;

    public VetSpecialty(Long specialty, Long vet) {
        this.specialty = specialty;
        this.vet = vet;
    }

    public Long getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Long specialty) {
        this.specialty = specialty;
    }

    public Long getVet() {
        return vet;
    }

    public void setVet(Long vet) {
        this.vet = vet;
    }
}
